class st {
    public static void main(String[] args) {
        String dnaSequence = "ATGCGTAGCATCGATCG";
        int segmentStart = 4; // Start index of the segment
        int segmentLength = 5; // Length of the segment


        int segmentEnd = segmentStart + segmentLength;
        String extractedSegment = dnaSequence.substring(segmentStart, segmentEnd);
        

        System.out.println("Original DNA: " + dnaSequence);
        System.out.println("Segment Start Index: " + segmentStart);
        System.out.println("Segment Length: " + segmentLength);
        System.out.println("Calculated Segment End Index (exclusive): " + segmentEnd);
        System.out.println("Extracted Segment: " + extractedSegment);
    }
}