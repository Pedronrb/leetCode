package binarySearch;

/*
 * Há uma matriz de inteiros numsclassificado em ordem crescente (com valores distintos).

Antes de ser passado para sua função, numsé possivelmente girado em um índice de pivô desconhecido k(Ao que aprocedado. 
Aí aproce (Ao que aprocedado1 <= k < nums.length) que a matriz resultante 
seja [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]](0-indexado). Por exemplo, [0,1,2,4,5,6,7]
pode ser girado no índice de pivô 3E tornar-se [4,5,6,7,0,1,2]- A . (í a , , , , , ínte , .

Dado o array numsapós a possível rotação e um inteiro target, retorne o índice de targetSe ele está em nums, ou -1Se não estiver em nums( , . e. . (em, on-) es. ,

Você deve escrever um algoritmo com O(log n)complexidade do tempo de execução.
 */

public class RotatedSortedArray {
    public int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            } else {
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;  
    }
}