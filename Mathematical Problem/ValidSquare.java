class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet();
            set.add(dis(p1, p2));
            set.add(dis(p1, p3));
            set.add(dis(p1, p4));
            set.add(dis(p2, p3));
            set.add(dis(p2, p4));
            set.add(dis(p3, p4));
            return !set.contains(0) && set.size() == 2;//!set.contains(0) is written to handel //         corner case i.e if p1,p2,p3 are at origin and p4 =[1,1] then also set size will be 2
        }

        // distance square method
        private int dis(int[] a, int[] b) {
            return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
        }   
}