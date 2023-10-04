data("diamonds")     # Loads diamonds dataset
View(diamonds)     # Opens diamonds dataset in a new tab

view_1 <- head(diamonds)     # Loads 1st 6 rows of diamonds dataset
View(view_1)     # Opens preview of diamonds dataset

str(diamonds)     # Returns structure metainformation of diamonds dataset

colnames(diamonds)    # Returns column names of diamonds dataset

mutate(diamonds, carat_2 = carat * 100) # adds new column to diamonds dataset