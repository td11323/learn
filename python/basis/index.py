months = ["January", "Febunary", "March", "April", "May", "June",
          "July", "August", "September", "October", "November", "December"]
endings = ["st", "nd", "rd"] + 7 * ["th"] + \
    ["st", "nd", "rd"] + 7 * ["th"] + ["st", "nd", "rd"] + 7 * ["th"] + ["st"]
year = raw_input("year:")
month = raw_input("month(1~12):")
day = raw_input("day(1~31):")
month_number = int(month)
day_number = int(day)
month_name = months[month_number - 1]
day_order = endings[day_number - 1]
print(month_name + " " + day + day_order + "," + year)
