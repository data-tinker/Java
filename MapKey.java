class MapKey {
    public int idx;
    public int count;
    public int sum;

    public MapKey(int idx, int count, int sum) {
        this.idx = idx;
        this.count = count;
        this.sum = sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, count, sum);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof MapKey)) {
            return false;
        } else {
            MapKey other = (MapKey) obj;
            return Objects.equals(idx, other.idx)
                && Objects.equals(count, other.count)
                && Objects.equals(sum, other.sum);
        }
    }
}
