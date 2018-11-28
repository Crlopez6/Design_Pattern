package Strategy;

public enum BeeType {
    Lover {
        public void gameplan() {
            System.out.println("Repopulate!");
        }
    },
    
    Fighter {
        public void gameplan() {
            System.out.println("Fight to the death!");
        }
    },
    
    Worker {
        public void gameplan() {
            System.out.println("Make ROOMS!");
        }
    }
}
