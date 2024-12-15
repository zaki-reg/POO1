public class TestGenomicSequence {
    public static void main(String[] args) {
        // Test 1: Creating a GenomicSequence instance
        System.out.println("Test 1: Creating a GenomicSequence instance");
        GenomicSequence dna = new GenomicSequence("ATGCTACGTA");
        System.out.println();

        // Test 2: Finding a fragment
        System.out.println("Test 2: Finding fragments");
        System.out.println("Contains 'TAC': " + dna.findFragment("TAC")); 
        System.out.println("Contains 'GGA': " + dna.findFragment("GGA")); 
        System.out.println();

        // Test 3: Reverse complement
        System.out.println("Test 3: Reverse Complement");
        System.out.println("Reverse Complement: " + dna.getReverseComplement());
        System.out.println();

        // Test 4: Base composition
        System.out.println("Test 4: Base Composition");
        int[] composition = dna.calculateBaseComposition();
        System.out.println("A: " + composition[0] + ", T: " + composition[1] +
                           ", C: " + composition[2] + ", G: " + composition[3]); 
        System.out.println();

        // Test 5: Insert a subsequence
        System.out.println("Test 5: Inserting a subsequence");
        dna.insertSubsequence("GGG", 3);
        System.out.println("After Insertion: " + dna.reverseSequence()); 
        System.out.println();

        // Test 6: Mutating a base
        System.out.println("Test 6: Mutating a base");
        dna.mutateBase(5, 'A');
        System.out.println("After Mutation: " + dna.reverseSequence()); 
        System.out.println();

        // Test 7: Reverse the sequence
        System.out.println("Test 7: Reversing the sequence");
        String reversed = dna.reverseSequence();
        System.out.println("Reversed Sequence: " + reversed); 
        System.out.println();

        // Test 8: Compare two sequences
        System.out.println("Test 8: Comparing sequences");
        GenomicSequence dna2 = new GenomicSequence("ATGGGACTACGTA");
        System.out.println("Are sequences equal: " + dna.compareSequences(dna2)); 
        System.out.println();


    }
}
