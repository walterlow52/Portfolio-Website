data("quartet")    # Loads quartet dataset
View(quartet)     # Opens quartet dataset in a new tab

quartet %>%    # Returns stats from quartet dataset
  group_by(set) %>% 
  summarize(mean(x), sd(x), mean(y), sd(y), cor(x, y))

# Creates visualization of statistics from quartet dataset
ggplot(quartet, aes(x, y)) + geom_point() + geom_smooth(method = lm, se = FALSE) + facet_wrap(~set)

# Creates different visualizations for each datasaurus dataset
ggplot(datasaurus_dozen, aes(x = x, y = y, colour = dataset)) + geom_point() + theme_void() + theme(legend.position = "none") + facet_wrap(~dataset, ncol = 3)
