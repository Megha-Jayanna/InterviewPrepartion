package BehavioralDesignPatterns;

/**
 * Iterator Design Pattern - SIMPLE Demon Slayer Example
 * Iterator accesses elements of collection sequentially
 * Example: Iterating through Demon Slayer members
 */

public class IteratorPattern {

    // Iterator interface
    interface SlayerIterator {
        boolean hasNext();
        String next();
    }

    // Concrete iterator
    static class SlayerIteratorImpl implements SlayerIterator {
        private String[] slayers;
        private int index = 0;

        public SlayerIteratorImpl(String[] slayers) {
            this.slayers = slayers;
        }

        @Override
        public boolean hasNext() {
            return index < slayers.length;
        }

        @Override
        public String next() {
            return slayers[index++];
        }
    }

    // Collection class
    static class SlayerCollection {
        private String[] slayers;

        public SlayerCollection(String[] slayers) {
            this.slayers = slayers;
        }

        public SlayerIterator createIterator() {
            return new SlayerIteratorImpl(slayers);
        }
    }

    public static void main(String[] args) {
        String[] slayerNames = {"Tanjiro", "Zenitsu", "Inosuke", "Kanao"};
        SlayerCollection collection = new SlayerCollection(slayerNames);

        SlayerIterator iterator = collection.createIterator();

        System.out.println("Demon Slayer Members:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}
