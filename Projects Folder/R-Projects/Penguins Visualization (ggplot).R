data(penguins)     # Loads penguins dataset
View(penguins)    # Opens penguins dataset in a new tab

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g))

# Alternate syntax for creating penguin visualization
ggplot(data = penguins, mapping = aes(x = flipper_length_mm, y = body_mass_g)) + geom_point()

# Creates scatter plot visualization showing relationship between penguins' bill length and bill depth
ggplot(data = penguins) + geom_point(mapping = aes(x = bill_length_mm, y = bill_depth_mm))

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using color to distinguish each penguin species
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, color = species))

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using shape to distinguish each penguin species
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, shape = species))

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using shape & color to distinguish each penguin species
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, shape = species, color = species))

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using shape, color & size to distinguish each penguin species
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, shape = species, color = species, size = species))

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using alpha to distinguish each penguin species
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, alpha = species))

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using blue scatter points
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g), color = "blue")

# Creates smooth line visualization showing relationship between penguins' flipper length and body mass
ggplot(data = penguins) + geom_smooth(mapping = aes(x = flipper_length_mm, y = body_mass_g))

# Creates scatter plot & smooth line visualization showing relationship between penguins' flipper length and body mass
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g)) + geom_smooth(mapping = aes(x = flipper_length_mm, y = body_mass_g))

# Creates smooth line visualization showing relationship between penguins' flipper length and body mass using linetype to distinguish each penguin species
ggplot(data = penguins) + geom_smooth(mapping = aes(x = flipper_length_mm, y = body_mass_g, linetype = species))

# Creates jitter scatter plot visualization showing relationship between penguins' flipper length and body mass
ggplot(data = penguins) + geom_jitter(mapping = aes(x = flipper_length_mm, y = body_mass_g))

# Creates bar chart visualization for diamonds' cut
ggplot(data = diamonds) + geom_bar(mapping = aes(x = cut))

# Creates bar chart visualization for diamonds' cut using color
ggplot(data = diamonds) + geom_bar(mapping = aes(x = cut, color = cut))

# Creates bar chart visualization for diamonds' cut using fill color
ggplot(data = diamonds) + geom_bar(mapping = aes(x = cut, fill = cut))

# Creates bar chart visualization for diamonds' cut while filling color for clarity to create a stacked bar chart
ggplot(data = diamonds) + geom_bar(mapping = aes(x = cut, fill = clarity))

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using color to distinguish each penguin species & facets to separate data for each species 
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, color = species)) + facet_wrap(~species)

# Creates bar chart visualization for diamonds' color using fill color for diamond cut and facets to separate data for each cut
ggplot(data = diamonds) + geom_bar(mapping = aes(x = color, fill = cut)) + facet_wrap(~cut)

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using color to distinguish each penguin species and facets to separate penguin sex & species data
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, color = species)) + facet_grid(sex~species)

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using color to distinguish each penguin species with an added title
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, color = species)) + labs(title = "Palmer Penguins: Body Mass vs. Flipper Length")

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using color to distinguish each penguin species with an added title and subtitle
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, color = species)) + labs(title = "Palmer Penguins: Body Mass vs. Flipper Length", subtitle = "Sample of Three Penguin Species")

# Creates scatter plot visualization showing relationship between penguins' flipper length and body mass using color to distinguish each penguin species with an added title, subtitle, captions, and annotations
ggplot(data = penguins) + geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, color = species)) + labs(title = "Palmer Penguins: Body Mass vs. Flipper Length", subtitle = "Sample of Three Penguin Species", caption = "Data collected by Dr. Kristen Gorman") + annotate("text", x = 220, y = 3500, label = "The Gentoos are the largest", color = "blue", fontface = "bold", size = 5, angle = 25)
ggsave("Palmer Penguins (ggsave()).png", width = 5, height = 5)


# ggplot(data = <DATA>) + <GEOM_FUNCTION>(mapping = aes(<AESTHETIC MAPPING>))
# facet_wrap is ideal for one variable & facet_grid is ideal for multiple variables