View(airquality)

# Rows that are extremely sunny and windy
x <- subset(airquality, Solar.R > 150 & Wind > 10)
View(x)

# Rows where it is extremely sunny or extremely windy
y <- subset(airquality, Solar.R > 150 | Wind > 10)
View(y)

# Weather measurements for all days except the 1st of each month
a <- subset(airquality, Day != 1)
View(a)

# Rows that are not extremely sunny or extremely windy
b <- subset(airquality, !(Solar.R > 150 | Wind > 10))
View(b)