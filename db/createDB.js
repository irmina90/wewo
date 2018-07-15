db = db.getSiblingDB('wewo');

db.user.insert({
  username: 'admin',
  password: 'root',
  email: 'abc@test.pl',
  type: 'priest'
});

db.user.insert({
    username: 'wojtek',
    password: 'wojtus',
    email: 'abc@test.pl',
    type: 'priest'
});

db.user.insert({
    username: 'weronika',
    password: 'weroniczka',
    email: 'abc@test.pl',
    type: 'priest'
});