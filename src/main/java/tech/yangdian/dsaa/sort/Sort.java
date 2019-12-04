package tech.yangdian.dsaa.sort;

public interface Sort
{
    enum Type
    {
        ASC
                {
                    public boolean fit(int first, int second)
                    {
                        return first <= second ? true : false;
                    }

                    public boolean fit(long first, long second)
                    {
                        return first <= second ? true : false;
                    }

                    public boolean fit(float first, float second)
                    {
                        return first <= second ? true : false;
                    }

                    public boolean fit(double first, double second)
                    {
                        return first <= second ? true : false;
                    }

                    public boolean fit(SortItem first, SortItem second)
                    {
                        return first.compareTo(second) <= 0 ? true : false;
                    }
                },
        DESC
                {
                    public boolean fit(int first, int second)
                    {
                        return first >= second ? true : false;
                    }

                    public boolean fit(long first, long second)
                    {
                        return first >= second ? true : false;
                    }

                    public boolean fit(float first, float second)
                    {
                        return first >= second ? true : false;
                    }

                    public boolean fit(double first, double second)
                    {
                        return first >= second ? true : false;
                    }

                    public boolean fit(SortItem first, SortItem second)
                    {
                        return first.compareTo(second) >= 0 ? true : false;
                    }
                },
        ;


        public abstract boolean fit(int first, int second);

        public abstract boolean fit(long first, long second);

        public abstract boolean fit(float first, float second);

        public abstract boolean fit(double first, double second);

        public abstract boolean fit(SortItem first, SortItem second);
    }
}
