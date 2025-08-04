print("----ZAKAT CALCULATOR----")
print ("Please follow the instructions to get your zakat calculated , accurately")


monthly_income=int(input("Please enter your monthly income \n"))
yearly_income=monthly_income*12

user_affirmation=input(f"Your yearly income is {yearly_income}   \n Yes or No \n")

if user_affirmation.upper()=="Yes":
    zakat=yearly_income*2.5/100
    print ("Your yearly zakat is", zakat)
    print ("May Allah SWT increase you in wealth , health and faith. Ameen")
else:
    YearlyIncome=int(input("Please enter your yearly income."))
    Zakat=YearlyIncome*2.5/100
    print ("Your yearly zakat is", Zakat)
    print ("May Allah SWT make halal income enough for you and prevent you from haram. Ameen")