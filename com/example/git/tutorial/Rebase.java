package com.example.git.tutorial;

import java.util.Objects;

public class Rebase {
    private final String branchName;

    public Rebase(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rebase rebase = (Rebase) o;

        return Objects.equals(branchName, rebase.branchName);
    }

    @Override
    public int hashCode() {
        return branchName != null ? branchName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Rebase{" +
                "branchName='" + branchName + '\'' +
                '}';
    }

    public String getBranchName() {
        return branchName;
    }
}
