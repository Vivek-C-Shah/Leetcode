class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;
        for(int i=0;i<tickets.length;i++) {
            if(i<=k) {
                if(tickets[i]<=tickets[k]) ans+=tickets[i];
                else ans+=tickets[k];
            }
            else {
                if(tickets[i]<tickets[k]) ans+=tickets[i];
                else ans+=tickets[k]-1;
            }
        }
        return ans;
    }
}