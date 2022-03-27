package com.sivanagireddy.springbatch;

import com.sivanagireddy.springbatch.domain.Product;
import org.springframework.batch.item.ItemProcessor;


public class ProductItemProcessor implements ItemProcessor<Product, Product> {

    @Override
    public Product process(Product product) throws Exception {
        return null;
    }
}
