skim_without_charts(penguins) # Returns summary & metainformation for penguins dataset
glimpse(penguins) # Another way to summarize penguins dataset
head(penguins) # Returns first 6 rows of penguins dataset

penguins %>% 
  select(species) # Returns only the species column from penguins dataset

penguins %>% 
  select(-species) # Returns all columns except species from penguins dataset
# select() allows the user to select a specific portion of a dataset

penguins %>% 
  rename(island_new = island) # Renames specified column 
# Rename() - (desired name, name of column to be replaced with new name)

rename_with(penguins, toupper) # Assigns all column names to uppercase for consistency
rename_with(penguins, tolower) # Assigns all column names to lowercase for consistency

clean_names(penguins) # Formats column names to remain consistent
