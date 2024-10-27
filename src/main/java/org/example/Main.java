public class Main {
    public static void main(String[] args) {
        PopulationReports reports = new PopulationReports();

        System.out.println("Countries by population:");
        reports.getCountriesByPopulation();

        System.out.println("\nCountries in the world by population:");
        reports.getCountriesByPopulationInContinent("world");

        System.out.println("\nTop 5 populated countries in the world:");
        reports.getTopNCountriesByPopulation(5);
    }
}
