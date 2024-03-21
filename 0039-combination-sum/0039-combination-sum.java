class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(candidates);
        resComb(res, lst, candidates, target, 0);
        return res;
    }
    public void resComb(List<List<Integer>> res, List<Integer> lst,int[] arr, int tar, int start){
        if(tar == 0) {
            res.add(new ArrayList<>(lst));
            return;
        }
        for (int j = start; j < arr.length && arr[j] <= tar; j++) {
            lst.add(arr[j]);
            resComb(res, lst, arr, tar-arr[j], j);
            lst.remove(lst.size());
        }
    }
}