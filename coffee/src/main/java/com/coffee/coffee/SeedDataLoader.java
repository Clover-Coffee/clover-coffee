package com.coffee.coffee;

import com.coffee.coffee.model.Item;
import com.coffee.coffee.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedDataLoader implements CommandLineRunner {

    private final ItemRepository itemRepository;

    @Autowired
    public SeedDataLoader(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Item item1 = new Item("Item 1", 10.50, "Description for item 1", "image1.jpg");
        Item item2 = new Item("Item 2", 15.00, "Description for item 2", "image2.jpg");
        Item item3 = new Item("Item 3", 20.00, "Description for item 3", "image3.jpg");

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);
    }
}
