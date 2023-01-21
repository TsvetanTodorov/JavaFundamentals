package ObjectsAndClasses.Exercise.tWProjects;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int teamsCount = Integer.parseInt(scanner.nextLine());

        List<Team> listOfTeams = new ArrayList<>();

        for (int i = 0; i < teamsCount; i++) {
            String[] data = scanner.nextLine().split("-");

            if (doesTeamAlreadyExist(data[1], listOfTeams)) {
                System.out.printf("Team %s was already created!%n", data[1]);
                continue;
            }

            if (doesUserAlreadyCreatedTeam(data[0], listOfTeams)) {
                System.out.printf("%s cannot create another team!%n", data[0]);
                continue;
            }

            User user = new User(data[0]);
            Team team = new Team(data[1], user);
            listOfTeams.add(team);
            System.out.printf("Team %s has been created by %s!%n", team.getName(), user.getName());

        }

        String[] data = scanner.nextLine().split("->");
        while (!data[0].equals("end of assignment")) {
            if (!doesTeamAlreadyExist(data[1], listOfTeams)) {
                System.out.printf("Team %s does not exist!%n", data[1]);
                data = scanner.nextLine().split("->");
                continue;
            }

            if (doesMemberHaveTeam(data[0], listOfTeams)) {
                System.out.printf("Member %s cannot join team %s!%n", data[0], data[1]);
                data = scanner.nextLine().split("->");
                continue;
            }

            User user = new User(data[0]);
            Team team = findTeamByName(data[1], listOfTeams);
            team.getListOfMembers().add(user);

            data = scanner.nextLine().split("->");
        }

        List<Team> validTeams = findValidTeams(listOfTeams);
        List<Team> invalidTeams = findInvalidTeams(listOfTeams);

        validTeams.sort(Comparator.comparing(Team::getSize).reversed().thenComparing(Team::getName));
        invalidTeams.sort(Comparator.comparing(Team::getName));

        printValidTeams(validTeams);
        printInvalidTeams(invalidTeams);
    }

    private static void printInvalidTeams(List<Team> invalidTeams) {
        System.out.println("Teams to disband:");
        for (Team team : invalidTeams) {
            System.out.println(team.getName());
        }
    }

    private static void printValidTeams(List<Team> validTeams) {
        for (Team team : validTeams) {
            System.out.println(team.getName());
            System.out.println("- " + team.getCreator().getName());
            team.getListOfMembers().sort(Comparator.comparing(User::getName));
            for (User member : team.getListOfMembers()) {
                System.out.println("-- " + member.getName());
            }
        }
    }

    private static List<Team> findInvalidTeams(List<Team> listOfTeams) {
        List<Team> invalidTeams = new ArrayList<>();
        for (Team team : listOfTeams) {
            if (team.getListOfMembers().size() == 0) {
                invalidTeams.add(team);
            }
        }
        return invalidTeams;
    }

    private static List<Team> findValidTeams(List<Team> listOfTeams) {
        List<Team> validTeams = new ArrayList<>();
        for (Team team : listOfTeams) {
            if (team.getListOfMembers().size() >= 1) {
                validTeams.add(team);
            }
        }
        return validTeams;
    }

    private static Team findTeamByName(String teamName, List<Team> listOfTeams) {
        for (Team team : listOfTeams) {
            if (team.getName().equals(teamName)) {
                return team;
            }
        }

        return null;
    }

    private static boolean doesMemberHaveTeam(String userName, List<Team> listOfTeams) {
        for (Team team : listOfTeams) {
            if (team.getCreator().getName().equals(userName)) {
                return true;
            }
            for (User member : team.getListOfMembers()) {
                if (member.getName().equals(userName)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean doesUserAlreadyCreatedTeam(String creatorName, List<Team> listOfTeams) {

        for (Team team : listOfTeams) {
            if (team.getCreator().getName().equals(creatorName)) {
                return true;
            }
        }

        return false;
    }

    private static boolean doesTeamAlreadyExist(String teamName, List<Team> listOfTeams) {
        for (Team team : listOfTeams) {
            if (team.getName().equals(teamName)) {
                return true;
            }
        }

        return false;
    }


}
