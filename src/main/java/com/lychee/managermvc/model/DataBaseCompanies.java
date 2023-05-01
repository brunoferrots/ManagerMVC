package com.lychee.managermvc.model;

import java.util.*;

public class DataBaseCompanies {

    private static List<Company> companies = new ArrayList<>();
    private static Integer sequentialKey = 1;

    static {
        DataBaseCompanies.companies.add(new Company("Oracle", new Date(), sequentialKey++));
        DataBaseCompanies.companies.add(new Company("JetBrains", new Date(), sequentialKey++));
    }

    public void annex(Company company) {
        company.setId(DataBaseCompanies.sequentialKey++);
        DataBaseCompanies.companies.add(company);
    }

    public List<Company> showDBC() {
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

}
