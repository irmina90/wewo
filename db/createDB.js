db = db.getSiblingDB('wewo');

db.user.insert({
  login: 'admin',
  password: 'root',
  email: 'abc@test.pl',
  type: 'priest'
});