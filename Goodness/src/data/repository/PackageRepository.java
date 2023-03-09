package data.repository;

import data.model.Package;

import java.util.List;

public interface PackageRepository {
    Package save(Package apackage);

    void delete(Package apackage);

    void delete(int id);

    List<Package> findAll();

    Package findById(int id);

    long count();
}
