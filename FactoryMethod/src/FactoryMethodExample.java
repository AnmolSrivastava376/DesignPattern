// Product interface : defines the interface of objects that the factory method creates
interface Arena {
    void startMatch();
}

// Concrete Products : implementations of the Product interface
class PracticeMap implements Arena {
    @Override
    public void startMatch() {
        System.out.println("Practice map: Match started.");
    }
}

class CompetitiveArena implements Arena {
    @Override
    public void startMatch() {
        System.out.println("Competitive arena: Match started.");
    }
}

class UnratedArena implements Arena {
    @Override
    public void startMatch() {
        System.out.println("Unrated arena: Match started.");
    }
}

class DeathmatchArena implements Arena {
    @Override
    public void startMatch() {
        System.out.println("Deathmatch arena: Match started.");
    }
}

// Creator interface : interface for superclass that contains the factory method for creating objects
interface ArenaFactory {
    Arena createArena();
}

// Concrete Creators : subclasses of the Creator that override the factory method to produce specific types of products.
class PracticeMapFactory implements ArenaFactory {
    @Override
    public Arena createArena() {
        return new PracticeMap();
    }
}

class CompetitiveArenaFactory implements ArenaFactory {
    @Override
    public Arena createArena() {
        return new CompetitiveArena();
    }
}

class UnratedArenaFactory implements ArenaFactory {
    @Override
    public Arena createArena() {
        return new UnratedArena();
    }
}

class DeathmatchArenaFactory implements ArenaFactory {
    @Override
    public Arena createArena() {
        return new DeathmatchArena();
    }
}

// Main code
public class FactoryMethodExample {
    public static void main(String[] args) {
        ArenaFactory practiceMapFactory = new PracticeMapFactory();
        Arena practiceMap = practiceMapFactory.createArena();
        practiceMap.startMatch();

        ArenaFactory competitiveArenaFactory = new CompetitiveArenaFactory();
        Arena competitiveArena = competitiveArenaFactory.createArena();
        competitiveArena.startMatch();

        ArenaFactory unratedArenaFactory = new UnratedArenaFactory();
        Arena unratedArena = unratedArenaFactory.createArena();
        unratedArena.startMatch();

        ArenaFactory deathmatchArenaFactory = new DeathmatchArenaFactory();
        Arena deathmatchArena = deathmatchArenaFactory.createArena();
        deathmatchArena.startMatch();
    }
}
