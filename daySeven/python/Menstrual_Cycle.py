from datetime import datetime, timedelta
def calculate_next_flow_date(last_cycle_date, cycle_duration):
	return last_cycle_date + timedelta(days=cycle_duration)

last_cycle_date_str = input("Enter your last menstrual cycle date (dd-MM-yyyy): ")
last_cycle_date = datetime.strptime(last_cycle_date_str, "%d-%m-%Y")

cycle_duration_str = input("Enter your average cycle duration: ")
cycle_duration = int(cycle_duration_str)

next_flow = calculate_next_flow_date(last_cycle_date, cycle_duration)

safe_period_start = next_flow - timedelta(days=9)
safe_period_end = next_flow - timedelta(days=1)

fertility_period_start = next_flow - timedelta(days=18)
fertility_period_end = next_flow - timedelta(days=10)

formatter = "%d-%m-%Y"
print("Next flow date:", next_flow.strftime(formatter))
print("Safe period:", safe_period_start.strftime(formatter), "to", safe_period_end.strftime(formatter))
print("Fertility period:", fertility_period_start.strftime(formatter), "to", fertility_period_end.strftime(formatter))
