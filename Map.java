public interface Map {

    /**
     * Remove all keys and values from the Map.
     */
    public void clear();

    /**
     * Get the number of elements in the Map.
     *
     * @return The size of the Map.
     */
    public int size();

    /**
     * Check if a key is in the Map.
     *
     * @param key The key.
     * @return True if the key is in the map, false otherwise.
     */
    public boolean contains(Integer key);

    /**
     * Put a key and a value into the Map.
     *
     * If the key is not already in the Map, it should be added. If the key is
     * already in the Map, its value should be updated.
     *
     * @param key The key.
     * @param value The value.
     * @return True if the key is new, false otherwise.
     */
    public boolean put(Integer key, Integer value);

    /**
     * Get the value associated with a key.
     *
     * This function assumes that the key is in the Map.
     *
     * @param key The key.
     * @return The value associated with the key.
     */
    public Integer get(Integer key);

    /**
     * Remove the key and value from the Map, if it exists.
     *
     * @param key The key to remove.
     */
    public void remove(Integer key);
}
