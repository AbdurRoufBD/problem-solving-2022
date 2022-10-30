package leetcode.heap.find_median_from_data_stream;

public class Runner {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(-2);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(-3);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(-4);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(-5);
        System.out.println(medianFinder.findMedian());


        System.out.println(medianFinder.findMedian());
    }
}

//["MedianFinder","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian"]
//[[],[-1],[],[-2],[],[-3],[],[-4],[],[-5],[]]
