# Manually creating employee data frame 
id <- c(1:10)
name <- c("John Mendes", "Rob Stewart", "Rachel Abrahamson", "Christy Hickman", "Johnson Harper", "Candace Miller", "Carlson Landy", "Pansy Jordan", "Darius Berry", "Claudia Garcia")
job_title <- c("Professional", "Programmer", "Management", "Clerical", "Developer", "Programmer", "Management", "Clerical", "Developer", "Programmer")

employee <- data.frame(id, name, job_title) # Run to view the dataset in a new tab

# Separates name column into first & last name columns using a separator
separate(employee, name, into = c('first_name', 'last_name'), sep = ' ')

# Employee data frame V2
first_name <- c("John", "Rob", "Rachel", "Christy", "Johnson", "Candace", "Carlson", "Pansy", "Darius", "Claudia")
last_name <- c("Mendes", "Stewart", "Abrahamson", "Hickman", "Harper", "Miller", "Landy", "Jordan", "Berry", "Garcia")
job_title <- c("Professional", "Programmer", "Management", "Clerical", "Developer", "Programmer", "Management", "Clerical", "Developer", "Programmer")

employee_v2 <- data.frame(id, first_name, last_name, job_title)

# Unites first & last name columns into one name column with employee_v2 data frame
unite(employee_v2, 'name', first_name, last_name, sep = ' ')

View(penguins)    # Opens penguins dataset in a new tab
penguins_new <- penguins %>%     # Adds new column for body mass of penguins in kilograms (kg) & flipper length in meters (m)
  mutate(body_mass_kg = body_mass_g/1000, flipper_length_m = flipper_length_mm/1000)
View(penguins_new)