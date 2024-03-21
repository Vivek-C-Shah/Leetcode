class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(candidates);
        combRecHelper(res, lst, candidates, target, 0);
        return res;
    }

    public static  void combRecHelper(List<List<Integer>> res, List<Integer> lst, int[] arr, int tar, int start){
        if(tar == 0){
            res.add(new ArrayList<>(lst));
            return;
        }
        for (int i = start; i < arr.length && arr[i] <= tar; i++) {
            lst.add(arr[i]);
            combRecHelper(res, lst, arr, tar-arr[i], i);
            lst.removeLast();
        }
    }
}