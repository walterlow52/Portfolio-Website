penguins %>% 
  arrange(bill_length_mm) # Returns tibble of penguins dataset sorted by bill_length in ascending order

penguins %>% 
  arrange(-bill_length_mm) # Returns tibble of penguins dataset sorted by bill_length in descending order

penguins_sorted <- penguins %>% # Storing sorted dataset into data frame variable
  arrange(bill_length_mm) # Returns tibble of penguins dataset sorted by bill_length in ascending order

View(penguins_sorted) # Opens new sorted data frame variable in a new tab

penguins %>%     # Returns dataset with island values sorted, removes N/A values, & gets the mean value of bill lengths for each island species
  group_by(island) %>% 
  drop_na() %>% 
  summarize(mean_bill_length_mm = mean(bill_length_mm))

penguins %>%     # Returns dataset with island values sorted, removes N/A values, & gets the maximum value of bill lengths for each island species
  group_by(island) %>% 
  drop_na() %>% 
  summarize(maximum_bill_length_mm = max(bill_length_mm))

penguins %>%     # Returns dataset with column values sorted by species & island, removes N/A values, & gets the mean & maximum values of bill lengths for each island & species
  group_by(species, island) %>% 
  drop_na() %>% 
  summarize(maximum_bill_length_mm = max(bill_length_mm), mean_bill_length_mm = mean(bill_length_mm))

penguins %>%     # Filters data to only return Gentoo penguins
  filter(species == "Gentoo")