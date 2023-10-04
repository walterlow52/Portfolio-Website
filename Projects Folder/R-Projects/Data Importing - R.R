data()     # Returns all default R datasets in a new tab
data(mtcars)     # Loads mtcars dataset 
mtcars     # Opens mtcars dataset in a new tab

readr_example()     # Returns dataset files in console (file path)
read_csv(readr_example("mtcars.csv")) # Opens file contents as a tibble from dataset using file path

readxl_example()    # Returns excel dataset files
read_excel(readxl_example("geometry.xlsx")) # Reads spreadsheet file using file path
excel_sheets(readxl_example("geometry.xlsx")) # Lists the individual sheets in the spreadsheet
read_excel(readxl_example("geometry.xlsx"), sheet = "Sheet1") # Returns tibble of specified sheet
