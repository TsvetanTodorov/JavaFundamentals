package FinalExamPrep;

import java.util.*;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int heroesCounter = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();

        for (int i = 0; i < heroesCounter; i++) {
            String[] data = scanner.nextLine().split(" ");
            String heroName = data[0];
            int hp = Integer.parseInt(data[1]);
            int mana = Integer.parseInt(data[2]);

            heroesMap.put(heroName, new ArrayList<>());
            heroesMap.get(heroName).add(0, hp);
            heroesMap.get(heroName).add(1, mana);

        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            if (input.contains("CastSpell")) {
                String heroName = input.split(" - ")[1];
                int manaNeeded = Integer.parseInt(input.split(" - ")[2]);
                String spellName = input.split(" - ")[3];

                int currentMana = heroesMap.get(heroName).get(1);
                if (currentMana >= manaNeeded) {
                    heroesMap.get(heroName).set(1, currentMana - manaNeeded);
                    System.out.printf("%s has successfully cast %s and now has %d MP!\n",
                            heroName, spellName, currentMana - manaNeeded);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!\n",
                            heroName, spellName);
                }
            } else if (input.contains("TakeDamage")) {
                String heroName = input.split(" - ")[1];
                int damage = Integer.parseInt(input.split(" - ")[2]);
                String attacker = input.split(" - ")[3];

                int currentHeroHp = heroesMap.get(heroName).get(0);
                if (currentHeroHp > damage) {
                    heroesMap.get(heroName).set(0, currentHeroHp - damage);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",
                            heroName, damage, attacker, currentHeroHp - damage);
                } else {
                    heroesMap.remove(heroName);
                    System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                }
            } else if (input.contains("Recharge")) {
                String heroName = input.split(" - ")[1];
                int amount = Integer.parseInt(input.split(" - ")[2]);

                int currentMana = heroesMap.get(heroName).get(1);
                heroesMap.get(heroName).set(1, currentMana + amount);
                int newMana = heroesMap.get(heroName).get(1);

                if (newMana > 200) {
                    heroesMap.get(heroName).set(1, 200);
                    System.out.printf("%s recharged for %d MP!\n", heroName, 200 - currentMana);
                } else {
                    System.out.printf("%s recharged for %d MP!\n", heroName, amount);
                }
            } else if (input.contains("Heal")) {
                String heroName = input.split(" - ")[1];
                int amount = Integer.parseInt(input.split(" - ")[2]);

                int currentHp = heroesMap.get(heroName).get(0);
                heroesMap.get(heroName).set(0, currentHp + amount);
                int newHp = heroesMap.get(heroName).get(0);

                if (newHp > 100) {
                    heroesMap.get(heroName).set(0, 100);
                    System.out.printf("%s healed for %d HP!\n", heroName, 100 - currentHp);
                } else {
                    System.out.printf("%s healed for %d HP!\n", heroName, amount);
                }
            }

            input = scanner.nextLine();
        }

        heroesMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue().get(0));
            System.out.println("  MP: " + entry.getValue().get(1));

        });

    }
}
