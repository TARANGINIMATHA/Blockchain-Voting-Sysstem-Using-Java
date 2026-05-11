public class Main {

    public static void main(String[] args) {

        Blockchain votingSystem = new Blockchain();

        votingSystem.addBlock("Tarangini voted for Candidate A");

        votingSystem.addBlock("pandu voted for Candidate B");

        votingSystem.addBlock("velu voted for Candidate A");

        votingSystem.displayBlockchain();
    }
}
