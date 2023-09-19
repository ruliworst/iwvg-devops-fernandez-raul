package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {
    public Stream<String> findUserFamilyNameBySomeImproperFraction() {
        return new UsersDatabase()
                .findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isImproper))
                .map(User::getFamilyName)
                .distinct();
    }

    public Stream<String> findUserIdByAllProperFraction() {
        return new UsersDatabase()
                .findAll()
                .filter(user -> user.getFractions().stream()
                        .allMatch(Fraction::isProper))
                .map(User::getId);
    }

    public Fraction findFractionMultiplicationByUserFamilyName(String familyName) {
        return new UsersDatabase()
                .findAll()
                .filter(usr -> usr.getFamilyName().equals(familyName))
                .findFirst()
                .flatMap(usr -> usr.getFractions().stream()
                        .reduce(Fraction::multiply))
                .orElse(null);
    }

    public Stream<Double> findDecimalFractionByNegativeSignFraction() {
        return new UsersDatabase()
                .findAll()
                .flatMap(user -> user.getFractions().stream())
                .filter(Fraction::isNegative)
                .map(Fraction::decimal);
    }
}