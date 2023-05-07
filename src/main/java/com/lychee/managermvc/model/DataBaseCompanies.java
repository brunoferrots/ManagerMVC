package com.lychee.managermvc.model;

import java.util.*;

public class DataBaseCompanies {

    private static List<Company> companies = new ArrayList<>();
    private static Integer sequentialKey = 1;
    private static List<User> usersList = new ArrayList<>();

    static {
        DataBaseCompanies.companies.add(new Company("Oracle", new Date(), sequentialKey++));
        DataBaseCompanies.companies.add(new Company("JetBrains", new Date(), sequentialKey++));
        DataBaseCompanies.usersList.add(new User("brunoIron", "6109"));
    }

    public void annex(Company company) {
        company.setId(DataBaseCompanies.sequentialKey++);
        DataBaseCompanies.companies.add(company);
    }

    public List<Company> showCompanies() {
        return DataBaseCompanies.companies;
    }

    public void remove(Integer id) {
        Iterator<Company> iter = companies.iterator();

        while (iter.hasNext()) {
            Company company = iter.next();

            if (Objects.equals(company.getId(), id)) {
                iter.remove();
            }
        }
    }

    public Company showCompanyForId(Integer companyId) {
        for (Company company : companies) {
            if (Objects.equals(company.getId(), companyId)) {
                return company;
            }
        }
        return null;
    }

    public User userValidation(String login, String password) {
        for (User user : usersList) {
            return (user.isEqual(login, password)) ? user : null;
        }
        return null;
    }
}
