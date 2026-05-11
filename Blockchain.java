import java.util.ArrayList;

public class Blockchain {

    ArrayList<Block> chain = new ArrayList<>();

    public Blockchain() {
        chain.add(createGenesisBlock());
    }

    public Block createGenesisBlock() {
        return new Block("Genesis Block", "0");
    }

    public Block getLatestBlock() {
        return chain.get(chain.size() - 1);
    }

    public void addBlock(String data) {

        Block latestBlock = getLatestBlock();

        Block newBlock = new Block(data, latestBlock.hash);

        chain.add(newBlock);
    }

    public void displayBlockchain() {

        for (Block block : chain) {

            System.out.println("---------------------------");

            System.out.println("Vote Data: " + block.data);

            System.out.println("Current Hash: " + block.hash);

            System.out.println("Previous Hash: " + block.previousHash);
        }
    }
}
