public class SegmentTree {

    int[] tree;
    int n;

    SegmentTree(int[] nums){

        n=nums.length;
        tree=new int[4*n];

        build(nums,0,n-1,0);
    }

    void build(int[] nums,int start,int end,int node){

        if(start==end)
            tree[node]=nums[start];

        else{

            int mid=(start+end)/2;

            build(nums,start,mid,2*node+1);
            build(nums,mid+1,end,2*node+2);

            tree[node]=Math.max(tree[2*node+1],tree[2*node+2]);
        }
    }

    int query(int l,int r){

        return queryUtil(0,n-1,l,r,0);
    }

    int queryUtil(int start,int end,int l,int r,int node){

        if(r<start||end<l)
            return Integer.MIN_VALUE;

        if(l<=start&&end<=r)
            return tree[node];

        int mid=(start+end)/2;

        return Math.max(
            queryUtil(start,mid,l,r,2*node+1),
            queryUtil(mid+1,end,l,r,2*node+2)
        );
    }

    public static void main(String[] args){

        int[] nums={1,3,5,7,9,11};

        SegmentTree st=new SegmentTree(nums);

        System.out.println(st.query(1,4));
    }
}