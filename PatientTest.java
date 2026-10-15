public class PatientTest {
    static int passed = 0, failed = 0;

    static void check(String name, boolean ok) {
        if (ok) { passed++; System.out.println("PASS " + name); }
        else { failed++; System.out.println("FAIL " + name); }
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        check("new patient has no name by default", p.name == null);
        check("new patient has age 0 by default", p.age == 0);

        p.name = "Asha Patil";
        p.age = 34;
        check("patient name is stored", "Asha Patil".equals(p.name));
        check("patient age is stored", p.age == 34);

        Patient q = new Patient();
        q.name = "Ravi Kumar";
        q.age = 50;
        check("two patients keep separate data",
              !p.name.equals(q.name) && p.age != q.age);

        System.out.println("\nPassed: " + passed + "  Failed: " + failed);
        if (failed > 0) System.exit(1);
    }
}