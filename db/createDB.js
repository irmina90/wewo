db = db.getSiblingDB('wewo');

db.user.insert({
  login: 'admin',
  password: 'root',
  email: 'abc@test.pl',
  type: 'priest'
});

db.event.insert({
  name: 'First event',
  startDateTime: ISODate("2018-09-10T10:30:00.000Z"),
  endDateTime: ISODate("2018-09-10T12:30:00.000Z")
});