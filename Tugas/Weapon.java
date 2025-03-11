package Relationship.Tugas;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    private String nama;
    private List<String> skill = new ArrayList<>();

    Weapon(String nama) {
        this.nama = nama;
    }

    String getWeaponName() {
        return nama;
    }

//    Method tambahan class Weapon
    void tambahSkill(String skill) {
        this.skill.add(skill);
    }
    void statistikWeapon() {
        System.out.printf("\nSkill Weapon %s :\n", getWeaponName());
        for (String skill: skill) {
            System.out.printf("- %s\n", skill);
        }
    }
}
