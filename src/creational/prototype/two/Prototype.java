package creational.prototype.two;

// 1. The clone() contract
interface Prototype {
  Prototype clone();
  String getName();
  void execute();
}
