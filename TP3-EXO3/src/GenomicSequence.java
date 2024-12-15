public class GenomicSequence {
    private StringBuilder sequence;

    public GenomicSequence(String sequence) {
        this.sequence = new StringBuilder(sequence);
    }

    public boolean findFragment(String fragment) {
        return sequence.indexOf(fragment) != -1;
    }

    public String getReverseComplement() {
        StringBuilder reverseComplement = new StringBuilder();

        for (int i = sequence.length() - 1; i >= 0; i--) {
            char singleLetter = sequence.charAt(i);
            switch (singleLetter) {
                case 'A': reverseComplement.append('T'); break;
                case 'T': reverseComplement.append('A'); break;
                case 'C': reverseComplement.append('G'); break;
                case 'G': reverseComplement.append('C'); break;
            }
        }

        return reverseComplement.toString();
    }
    public int[] calculateBaseComposition() {
        int[] counts = new int[4];
        for (char singleLetter : sequence.toString().toCharArray()) {
            switch (singleLetter) {
                case 'A': counts[0]++; break;
                case 'T': counts[1]++; break;
                case 'C': counts[2]++; break;
                case 'G': counts[3]++; break;
            }
        }
        return counts;
    }

    public void insertSubsequence(String subsequence, int position) {
    	if (position < 0 || position > sequence.length()) {
            System.out.println("Error: Invalid position " + position);
            return;}
        sequence.insert(position, subsequence);
    }

    public void mutateBase(int position, char newBase) {
        if (position < 0 || position >= sequence.length()) {
        	System.out.println("Error: Invalid position " + position);
        return;}
        sequence.setCharAt(position, newBase);
    }

    public boolean compareSequences(GenomicSequence other) {
        return sequence.toString().equals(other.sequence.toString());
    }

    public String reverseSequence() {
        return sequence.reverse().toString();
    }
}
