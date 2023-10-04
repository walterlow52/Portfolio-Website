data("ToothGrowth")    # Loads toothgrowth dataset
View(ToothGrowth)     # Opens toothgrowth dataset in new tab 

tg <- filter(ToothGrowth, dose == 0.5) # Filters toothgrowth dataset to show doses equal to 0.5 
View(tg)     # Opens filtered dataset

arrange(tg, len) # Sorts filtered toothgrowth dataset by len (appears in console)

arrange(filter(ToothGrowth, dose == 0.5), len) # Nested function 

# Function using pipes
tg_filter <- ToothGrowth %>%
  filter(dose == 0.5) %>% 
  arrange(len)
View(tg_filter)

# 2nd function using pipes
tg_filter_2 <- ToothGrowth %>%
  filter(dose == 0.5) %>% 
  group_by(supp) %>% 
  summarize(mean_len = mean(len, na.rm = T), .group = "drop")
View(tg_filter_2)
  
# Pipe keyboard shortcut: (ctrl + shift + m)