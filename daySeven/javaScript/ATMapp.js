class Account {
	constructor(firstName, lastName, pin, initialBalance) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.pin = pin;
	this.balance = initialBalance;
	}

	getFirstName() {
		return this.firstName;
	}

	getLastName() {
		return this.lastName;
  	}

	checkPin(pin) {
		return this.pin === pin;
	}

	getBalance() {
		return this.balance;
	}

	deposit(amount) {
		this.balance += amount;
		console.log(`Deposit successful. New balance: ${this.balance}`);
	}

	withdraw(amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
		console.log(`Withdrawal successful. New balance: ${this.balance}`);
	} else {
		console.log("Insufficient funds.");
	}
	}

	transfer(recipient, amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			recipient.deposit(amount);
			console.log(`Transfer successful. New balance: ${this.balance}`);
	} else {
		console.log("Insufficient funds.");
	}
	}

	changePin(newPin) {
		this.pin = newPin;
		console.log("PIN changed successfully.");
	}
	}

	let accounts = [];
	function createAccount() {
		console.log("Enter first name:");
		let firstName = prompt();
		console.log("Enter last name:");
		let lastName = prompt();
		console.log("Create PIN:");
		let pin = prompt();
		console.log("Enter initial balance:");
		let initialBalance = parseFloat(prompt());
		let account = new Account(firstName, lastName, pin, initialBalance);
		accounts.push(account);
		console.log("Account created successfully.");
	}
	
	function closeAccount() {
		console.log("Enter first name:");
		let firstName = prompt();
		console.log("Enter last name:");
		let lastName = prompt();
		let accountToRemove = null;
		for (let account of accounts) {
		if (account.getFirstName() === firstName && account.getLastName() === lastName) {
      		accountToRemove = account;
		break;
	}
	}
		if (accountToRemove !== null) {
		accounts.splice(accounts.indexOf(accountToRemove), 1);
		console.log("Account closed successfully.");
		} else {
		console.log("Account not found.");
	}
	}

	function deposit() {
		console.log("Enter first name:");
		let firstName = prompt();
  		console.log("Enter last name:");
  		let lastName = prompt();
 		console.log("Enter PIN:");
  		let pin = prompt();
  		let account = findAccount(firstName, lastName);
  		if (account !== null && account.checkPin(pin)) {
    		console.log("Enter deposit amount:");
    		let amount = parseFloat(prompt());
    		account.deposit(amount);
  	} else {
   		 console.log("Account not found or incorrect PIN.");
  	}
	}

	function withdraw() {
  		console.log("Enter first name:");
  		let firstName = prompt();
  		console.log("Enter last name:");
  		let lastName = prompt();
  		console.log("Enter PIN:");
  		let pin = prompt();
  		let account = findAccount(firstName, lastName);
 		if (account !== null && account.checkPin(pin)) {
    		console.log("Enter withdrawal amount:");
    		let amount = parseFloat(prompt());
    		account.withdraw(amount);
  	} else {
    		console.log("Account not found or incorrect PIN.");
  	}
	}

	function balance() {
  		console.log("Enter first name:");
  		let firstName = prompt();
  		console.log("Enter last name:");
 		let lastName = prompt();
  		let account = findAccount(firstName, lastName);
  		console.log("Enter PIN:");
  		let pin = prompt();
  		if (account !== null && account.checkPin(pin)) {
		let balance = account.getBalance();
    		console.log(`Your current balance is: ${balance}`);
  	} else {
    		console.log("Account not found or incorrect PIN.");
  	}
	}

	function transfer() {
  		console.log("Enter first name:");
  		let firstName = prompt();
  		console.log("Enter last name:");
  		let lastName = prompt();
  		console.log("Enter PIN:");
  		let pin = prompt();
  		let senderAccount = findAccount(firstName, lastName);
  		if (senderAccount !== null && senderAccount.checkPin(pin)) {
    		console.log("Enter recipient first name:");
    		let recipientFirstName = prompt();
    		console.log("Enter recipient last name:");
    		let recipientLastName = prompt();
   		let recipientAccount = findAccount(recipientFirstName, recipientLastName);
    		if (recipientAccount !== null) {
      		console.log("Enter amount to transfer:");
     		let amount = parseFloat(prompt());
      		senderAccount.transfer(recipientAccount, amount);
    	} else {
      		console.log("Recipient account not found.");
	}
  	} else {
    		console.log("Account not found or incorrect PIN.");
	}
	}

	function changePin() {
  		console.log("Enter first name:");
  		let firstName = prompt();
  		console.log("Enter last name:");
  		let lastName = prompt
