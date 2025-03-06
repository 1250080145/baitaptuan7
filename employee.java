package baitaptuan7_bai2;

    class employee extends person {
        private int salary;

        public employee(String name, String address, int salary) {
            super(name, address);
            this.salary=salary;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
        @Override
        public void display(){
            System.out.println("name: "+ getName());
            System.out.println("address: "+getAddress());
            System.out.println("salary: "+getSalary());
        }
    }

