package com.templatedriven.booking.repository;

import java.util.List;

public interface IRepository<TModel> {
    public List<TModel> GetAllData();
    public TModel GetData(int id);
    public TModel SaveData(TModel model);
    public TModel UpdateData(int id,TModel model);
    public boolean DeleteData(int id);
}