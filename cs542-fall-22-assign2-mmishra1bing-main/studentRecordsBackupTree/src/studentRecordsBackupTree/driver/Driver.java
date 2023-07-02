package studentRecordsBackupTree.driver;
import java.io.IOException;
import studentRecordsBackupTree.bst.BST;
import studentRecordsBackupTree.util.FileProcessor;
import studentRecordsBackupTree.util.Results;

// Do not use Java's built-in observer pattern, and instead design and develop it yourself.
/**
 * @author placeholder
 *
 */
public class Driver {
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

		if (args.length != 5 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")
				|| args[3].equals("${arg3}") || args[4].equals("${arg4}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		}
		else {

			//System.out.println("Hello World! Lets get started with the assignment")

			String pathToInput = args[0];
			String pathToOutput = args[1];
			String pathToErrorLogger = args[2];
			String DEBUG_LEVEL = args[3];
			int debugVal = Integer.parseInt(DEBUG_LEVEL);
			String UPDATE_VALUE = args[4];
			int updateVal = Integer.parseInt(UPDATE_VALUE);

			BST tree1 = new BST();
			BST tree2 = new BST();
			BST tree3 = new BST();

			StringBuilder mainTree = new StringBuilder();
			StringBuilder backup1 = new StringBuilder();
			StringBuilder backup2 = new StringBuilder();

			Results rp = new Results();
			rp.createFile(pathToErrorLogger);
			FileProcessor fp = new FileProcessor(pathToInput, pathToOutput, pathToErrorLogger);
			try {
				fp.getNodeInfo(pathToInput,pathToOutput, pathToErrorLogger, tree1, tree2, tree3);
			} catch (IOException e) {
				rp.writeToErrorLog("Could not Read from file");
				e.printStackTrace();
			}finally{

			}

			System.out.println("// Inorder traversal");
			System.out.print("BST: ");
			mainTree = tree1.inorder(mainTree);
			System.out.print(mainTree.substring(0, mainTree.toString().length()-2));
			System.out.println();
			System.out.print("Backup-1: ");
			backup1 = tree2.inorder(backup1);
			System.out.print(backup1.substring(0, backup1.toString().length()-2));
			System.out.println();
			System.out.print("Backup-2: ");
			backup2 = tree3.inorder(backup2);
			System.out.print(backup2.substring(0, backup2.toString().length()-2));
			System.out.println();

			//Sum of all BST trees
			int sumOfMainTree, sumOfBackup1, sumOfBackup2;
			sumOfMainTree = tree1.addBST(tree1.getRoot());
			sumOfBackup1 = tree2.addBST(tree2.getRoot());
			sumOfBackup2 = tree3.addBST(tree3.getRoot());
			System.out.println("\n// Sum of all the B-Numbers in each tree");
			System.out.println("BST: " + tree1.addBST(tree1.getRoot()));
			System.out.println("Backup-1: " + tree2.addBST(tree1.getRoot()));
			System.out.println("Backup-2: " + tree3.addBST(tree1.getRoot()));

			tree1.updateMain(updateVal);
			int upSumOfMainTree, upSumOfBackup1, upSumOfBackup2;
			upSumOfMainTree = tree1.addBST(tree1.getRoot());
			upSumOfBackup1 = tree2.addBST(tree1.getRoot());
			upSumOfBackup2 = tree3.addBST(tree1.getRoot());

			System.out.println("\n// Sum of all the B-Numbers after increment");
			System.out.println("BST: " + tree1.addBST(tree1.getRoot()));
			System.out.println("Backup-1: " + tree2.addBST(tree1.getRoot()));
			System.out.println("Backup-2: " + tree3.addBST(tree1.getRoot()));

			rp.displayToFile(mainTree, backup1, backup2, sumOfMainTree, sumOfBackup1, sumOfBackup2, upSumOfMainTree, upSumOfBackup1, upSumOfBackup2);

		}
	}
}
