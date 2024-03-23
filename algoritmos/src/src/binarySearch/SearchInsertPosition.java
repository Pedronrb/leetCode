public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0; // Se o array estiver vazio, retornamos 0, pois o valor alvo seria inserido no início do array vazio.
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left; // Se o valor alvo não for encontrado, retornamos left, pois indica a posição onde o valor alvo seria inserido mantendo a ordem do array.
    }
}
