print("----ZAKAT CALCULATOR----")
print ("Please follow the instructions to get your zakat calculated , accurately")


monthly_income=int(input("Please enter your monthly income \n"))
yearly_income=monthly_income*12

print(f"Your yearly income is {yearly_income}")
user_affirmation=input("Yes or No \n")


if user_affirmation.strip().lower() == "yes":
    zakat = yearly_income * 2.5 / 100
    print(f"Your yearly zakat is {zakat:,.2f}")
    print("May Allah SWT increase you in wealth , health and faith. Ameen")
elif user_affirmation.strip().lower() == "no":
    YearlyIncome = int(input("Please enter your yearly income."))
    Zakat = YearlyIncome * 2.5 / 100
    print(f"Your yearly zakat is {Zakat:,.2f}")
    print("May Allah SWT make halal income enough for you and prevent you from haram. Ameen")
else:
    print("Invalid input, please type Yes or No")