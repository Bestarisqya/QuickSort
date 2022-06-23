public class quicksort {
        private int[] data;
        public void setData(int[] data) { this.data = data; }
        private int partition (int start, int end){
            int pivot = this.data[end]; // elemn porosnya(pivot)
            int i = (start - 1);
            for (int j = start;1 <= end - 1; j++) {
                if (this.data[j] < pivot); //element saat ini lebih kecil dari pivot
                {
                    i++; // kenaikan index elemen yg lebih kecil
                    int t = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = t;
                }
            }
            int t = this.data[i+1];
            this.data[i+1] = this.data[end];
            this.data[end] = t;
            return (i + 1);
        }
        public void quickSort(int start, int end){ // fungsinya untuk mengimplementasikan quick sort
            if (start < end) {
                int p =  partition(start, end); // indeks partisipasi (angka yg ikut serta)
                quickSort(start, p - 1);
                quickSort(p + 1, end);
            }
        }
        public void printArr(int n){
            int i;
            for (i = 0; i < n; i++) {
                System.out.println(this.data[i] + "");
            }
        }
        public static void main(String[] args) {
            int[] dataArray = {12,18,1,0,56,76,98,34,12};
            int n = dataArray.length;
            System.out.println("""
                Before sorting array elements are -\s
                """);
            quicksort _mySQ = new quicksort();
            _mySQ.setData(dataArray);
            _mySQ.printArr(n);
            _mySQ.quickSort(0, n - 1);
            System.out.println("\n After sorting array elements are - ");
            _mySQ.printArr(n);
            System.out.println();
        }
}
