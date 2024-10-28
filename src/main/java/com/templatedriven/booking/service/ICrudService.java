package com.templatedriven.booking.service;

import java.util.List;

public interface ICrudService<TModel> {
    List<TModel> GetAll();
    TModel Get(int Id);
    TModel Create(TModel model);
    TModel Update(int Id,TModel model);
    boolean Delete(int Id);
}
