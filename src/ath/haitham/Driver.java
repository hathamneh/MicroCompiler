package ath.haitham;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Driver {

	public static void main(String[] args) throws Exception {

		// read input MICRO code
		InputStream is=null;
        String inputFile = null;
		try{
			inputFile = args[0];
			is = new FileInputStream(inputFile); 
		}
		catch ( Exception e){
			System.out.println("You must specify an input file");
			System.exit(0);
		} 

		ANTLRInputStream input = new ANTLRInputStream(is);

		// Scanner
        MicroLexer lexer = new MicroLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Parser
		MicroParser parser = new MicroParser(tokens);
		ParseTree tree = parser.program();

		// Symbol Table Generation
		SymbolTableVisitor symbolTable = new SymbolTableVisitor();
		symbolTable.visit(tree);

		// IR Generation
		IRVisitor irVisitor = new IRVisitor(symbolTable);
		irVisitor.visit(tree);

		// Print the code to console (This can be skipped)
		irVisitor.theCode.print();

		// Save to file
        String outputFile = inputFile.split("\\.")[0] + ".out";
        try {
            FileOutputStream os = new FileOutputStream(outputFile);
            os.write(irVisitor.theCode.toString().getBytes());
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
